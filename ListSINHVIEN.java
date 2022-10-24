hpackage BaiTapC2;
import java.util.ArrayList;
public class ListSINHVIEN {
	public ArrayList<SINHVIEN> list;
	public ListSINHVIEN() {
		this.list = new ArrayList<SINHVIEN>();
	}
	public ListSINHVIEN(ArrayList<SINHVIEN> list) {
		this.list = list;
	}
	public void themSinhVien(SINHVIEN sv) {
		this.list.add(sv);
	}
	public void inDanhSachSinhVien() {
		for (SINHVIEN sv : list) {
			System.out.println(sv);
		}
	}
	public boolean xoaSinhVien(SINHVIEN sv) {
		return this.list.remove(sv);
	}
	public boolean timTheomssv(SINHVIEN sv) {
		return this.list.contains(sv);
	}
	public static void main(String[] args) {
		SINHVIEN a = new SINHVIEN();
		a.nhapthongtin();
		SINHVIEN b = new SINHVIEN();
		b.nhapthongtin();
		a.toString();
		b.toString();
		ListSINHVIEN list = new ListSINHVIEN();
		list.themSinhVien(a);
		list.themSinhVien(b);
		list.inDanhSachSinhVien();
		list.xoaSinhVien(b);
		list.inDanhSachSinhVien();
	}

}
