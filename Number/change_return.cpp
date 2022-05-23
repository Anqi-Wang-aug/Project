#include<iostream>
using namespace std;

/* return coins in Canadian currency:
	penny = 0.01
	nickle: 0.05
	dime: 0.1
	quarter: 0.25
	loonie: 1
	toonie: 2
*/

int main()
{
	float cost, m;
	const float penny = 0.01, nickle = 0.05, dime = 0.1, quarter = 0.25, loonie =1, toonie = 2;
	int p=0, n=0, di=0, q=0, l=0, t=0;

	cout << "Cost: ";
	cin >> cost;
	cout << "Money given: ";
	cin >> m;
	float d = m-cost;
	while (d>0)
	{
		if(d>=toonie)
		{
			d-=toonie;
			t++;
		}
		else if(d>=loonie)
		{
			d-=loonie;
			l++;
		}
		else if(d>=quarter)
		{
			d-=quarter;
			q++;
		}
		else if(d>=dime)
		{
			d-=dime;
			di++;
		}
		else if(d>=nickle)
		{
			d-=nickle;
			n++;
		}
		else
		{
			d-=penny;
			p++;
		}
	}
	cout << "Change return: "<< endl;
	cout << "Penny"<< p << endl;
	cout << "Nickle"<< n << endl;
	cout << "Dime" << di << endl;
	cout << "Quarter" << q << endl;
	cout << "Loonie" << l << endl;
	cout << "Toonie" << t << endl;
}
