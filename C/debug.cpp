#include<bits/stdc++.h>
#define pb push_back
using namespace std;

vector<string> vec_splitter(string s) {
    s += ',';
    vector<string> res;
    while(!s.empty()) {
        res.pb(s.substr(0, s.find(',')));
        s = s.substr(s.find(',') + 1);
    }
    return res;
}

void debug_out(
    vector<string> __attribute__((unused)) args,
    __attribute__((unused)) int idx,
    __attribute__((unused)) int LINE_NUM) { cerr << "\n"; }

template <typename Head, typename... Tail>

void debug_out(vector<string> args, int idx, int LINE_NUM, Head H, Tail...T) {
    if(idx>0)
        cerr << ", ";
    else
        cerr << "Line(" << LINE_NUM << ")";
    stringstream ss;
    ss << H;
    cerr << args[idx] << "=" << ss.str();
    debug_out(args, idx + 1, LINE_NUM, T...);
}
#define XOX
#ifdef XOX
#define debug(...) debug_out(vec_splitter(#__VA_ARGS__), 0, __LINE__, __VA_ARGS__)
#else
#define debug(...) 18
#endif
