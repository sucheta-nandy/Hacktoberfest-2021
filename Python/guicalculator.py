from tkinter import *
root=Tk()
root.title("Rohit's Calc")
# creating main frame
mainframe=Frame(root,width=45,bd=10,relief=RIDGE,bg="blue")
mainframe.pack()
inner=Frame(mainframe,width=45,bd=10,relief=RIDGE,bg="black")
inner.pack()
e=Entry(inner,width=65,borderwidth=5)
e.grid(row=0,column=0,columnspan=4,padx=10,pady=1)
def onclick(num):
    x=e.get()
    e.delete(0,END)
    e.insert(0,str(x)+str(num))

def clear():
    e.delete(0,END)

def add(): 
    global first,op
    op='+'
    first=e.get()
    e.delete(0,END)

def sub():
    global first,op
    op='-'
    first=e.get()
    e.delete(0,END)

def mul():
    global first,op
    op='*'
    first=e.get()
    e.delete(0,END)

def div():
    global first,op
    op='/'
    first=e.get()
    e.delete(0,END)

def equal():
    second=e.get()
    if op=='+':
        result=float(first)+float(second)
    elif op=='-':
        result=float(first)-float(second)
    elif op=='*':
        result=float(first)*float(second)
    elif op=='/':
        result=float(first)/float(second)
    e.delete(0,END)
    e.insert(0,result)
############################################################
 ####Button widget####
button_1=Button(inner,text='1',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(1))
button_2=Button(inner,text='2',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(2))
button_3=Button(inner,text='3',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(3))
button_4=Button(inner,text='4',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(4))
button_5=Button(inner,text='5',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(5))
button_6=Button(inner,text='6',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(6))
button_7=Button(inner,text='7',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(7))
button_8=Button(inner,text='8',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(8))
button_9=Button(inner,text='9',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(9))
button_0=Button(inner,text='0',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=lambda:onclick(0))
# operation button
button_add=Button(inner,text='+',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=add)
button_sub=Button(inner,text='-',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=sub)
button_mul=Button(inner,text='*',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=mul)
button_div=Button(inner,text='/',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=div)
button_equal=Button(inner,text='=',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=equal)
button_clear=Button(inner,text='C',padx=30,pady=10,relief=RIDGE,font=15,width=4,command=clear)
#####place the number button######
button_1.grid(row=3,column=0)
button_2.grid(row=3,column=1)
button_3.grid(row=3,column=2)
button_4.grid(row=2,column=0)
button_5.grid(row=2,column=1)
button_6.grid(row=2,column=2)
button_7.grid(row=1,column=0)
button_8.grid(row=1,column=1)
button_9.grid(row=1,column=2)
button_0.grid(row=4,column=0)
button_add.grid(row=1,column=3)
button_sub.grid(row=2,column=3)
button_mul.grid(row=3,column=3)
button_div.grid(row=4,column=3)
button_equal.grid(row=4,column=2)
button_clear.grid(row=4,column=1)
root.mainloop()
