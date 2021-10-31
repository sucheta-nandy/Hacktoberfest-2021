class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
     if (tasks == null || tasks.length == 0)
            return -1;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for (char task:tasks)
            map.put(task,map.getOrDefault(task,0)+1);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.addAll(map.values());
        
        int cycles = 0;
        while (!pq.isEmpty()){
            
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<n+1;i++)
            {
                if(!pq.isEmpty())
                    temp.add(pq.remove()); //3 3 2 2 
            }
            
            for(int i:temp)
                if(--i>0)
                    pq.add(i);
            
            cycles+= pq.isEmpty()? temp.size():n+1;
// first we need to run A and B and wait till n cycles as we cant repeat during that tym
// then next tym only one A and one B is left so process is finished as soon as they get over and no need to wait

        }
        
        return cycles;
}
}
