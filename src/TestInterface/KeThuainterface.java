package TestInterface;

import QuanLyDiem.KhoaToan;

public class KeThuainterface implements Viduinterface {

    @Override
    public void thongTin(String ten, String cccd, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay * soNgayCong;
    }
}













