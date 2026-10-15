package com.syncronized;

public class SyncronizedClass 
{
	int totalSeat=10;
	int seat;
	
     synchronized void bookseat(int tseat)
	{
		if(tseat>=totalSeat)
		{
			System.out.println("seat are not available: "+(totalSeat-=tseat));
		}
		else
		{
			System.out.println("your seat booked succesfully: ");
			System.out.println("total seaat available : "+(totalSeat-=tseat));
		}
	}

}
