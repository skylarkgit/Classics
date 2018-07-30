#include<iostream>
using namespace std;

class Hanoi{
public:
	static void solve(int discs, char src='s', char dest='d',char aux='a'){
		if (discs == 1){
			cout<<"Move 1 from "<<src<<" to "<<dest<<endl;
			return;
		}
		solve(discs-1, src, aux, dest);
		cout<<"Move "<<discs<<" from "<<src<<" to "<<dest<<endl;
		solve(discs-1, aux, dest, src);
	}
};

int main(){

	Hanoi::solve(3);

}