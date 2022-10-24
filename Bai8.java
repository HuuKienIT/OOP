package tuan2;

import java.util.Scanner;

public class Bai8 {
	private int[] a=new int[100];
	private int n,tong,q;
	Scanner inp=new Scanner(System.in);
	public Bai8() {
		n=1;
		a[0]=0;
		tong=0;
	}
	private boolean NT ( int b) {
		if(b<2)
			return false ;
		for(int i=2;i<b;i++) 
			if((b%i)==0)
				return false;
		return true;
	}
	
	public void Xuat()
	{
		System.out.printf("Mang vua nhap co %d \n",n);
		for(int i=0;i<n;i++)
			System.out.printf("phan tu thu %d: %d \n",i,a[i]);
	}
	
	public void nhap() {
		System.out.print("Nhap so phan tu");
		n=inp.nextInt();
		for(int i=0;i<n;i++) {
			System.out.printf("nhap phan tu thu %d\n",i);
			a[i]=inp.nextInt();
		}
	}
	public void check() {
		System.out.print("cac phan tu trong mang: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+",");
		    tong=tong+a[i];
		    }
		System.out.printf("\ntong la: %d\n", tong);
		
		tong=0;
		System.out.print("cac so chan trong mang: ");
		for(int i=0;i<n;i++) {
			if ((a[i]%2)==0) {
				System.out.print(a[i]+",");
				tong+=a[i];
			}
		}
		System.out.printf("\ntong phan tu chan trong mang la: %d\n", tong);
		
		tong=0;
		System.out.print("cac so le trong mang: ");
		for(int i=0;i<n;i++) {
			if ((a[i]%2)!=0) {
				System.out.print(a[i]+",");
				tong+=a[i];
			}
		}
		System.out.printf("\ntong phan tu le trong mang la: %d\n", tong);
		
		tong=0;
		System.out.print("cac so NT trong mang la: ");
		for(int i=0;i<n;i++)
			if(NT(a[i])) {
				System.out.print(a[i]+",");
				tong+=a[i];
			}
		System.out.printf("tong so NT la: %d\n", tong);
		
		System.out.print("them 1 phan tu moi trong mang: ");
		a[n]=inp.nextInt();
		n=n+1;
		do{
		System.out.print("\nvi tri phan tu can xoa: ");
		tong=inp.nextInt();
		}while(tong>n);
		for(int i=tong;i<n-1;i++) {
			a[i]=a[i+1];
		}
		
		n=n-1;
		System.out.print("\ncac phan tu trong mang: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+",");
		}
		System.out.print("\nnhap so x can kiem tra: ");
		tong=inp.nextInt();
		for(q=0;q<n;q++) {
			if(tong==a[q]) {
				break;
			}
		}
		if(q<n-1)
			System.out.printf("\nvi tri cua x la: %d \n",q);
		else
			System.out.println("khong co");
		
	}
}
