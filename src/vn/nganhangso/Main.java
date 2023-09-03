package vn.nganhangso;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

import static java.lang.Integer.parseInt;

public class Main {
    public static int randomNumber(){
        return (int)(Math.random() * 900 + 100);
    }

    public static String processIdProvince(ArrayList<Province> listProvince ,
                                           String idProvince) {

        String nameProvince = "";
        for (Province province : listProvince) {
            if (province.getId().equals(idProvince)) {
                nameProvince = province.getName();
            }
        }
        return nameProvince;
    }

    public static String processGender(String genderNumber){
        int gender = parseInt(genderNumber) ;
        if (gender % 2 == 0) {
            return "Nam" ;
        } else return "Nữ" ;
    }

    public static String processAge(String genderNumnber , String birthYear) {
        int gender = parseInt(genderNumnber);
        int centery = switch (gender) {
            case 0, 1 -> 20;
            case 2, 3 -> 21;
            case 4, 5 -> 22;
            case 6, 7 -> 23;
            case 8, 9 -> 24;
            default -> 0;
        };

        return Integer.toString(centery - 1) + birthYear ;
    }
    public static void main(String[] args) {
        final String AUTHOR = "FX16615" ;
        final String VERSION = "@1.0.0";
        Scanner sc = new Scanner(System.in);
        ArrayList<Province> listProvince = new ArrayList<>();

        {
            listProvince.add(new Province("001", "Hà Nội"));
            listProvince.add(new Province("002", "Hà Giang"));
            listProvince.add(new Province("004", "Cao Bằng"));
            listProvince.add(new Province("006", "Bắc Kạn"));
            listProvince.add(new Province("008", "Tuyên Quang"));
            listProvince.add(new Province("010", "Lào Cai"));
            listProvince.add(new Province("011", "Điện Biên"));
            listProvince.add(new Province("012", "Lai Châu"));
            listProvince.add(new Province("014", "Sơn La"));
            listProvince.add(new Province("015", "Yên Bái"));
            listProvince.add(new Province("017", "Hòa Bình"));
            listProvince.add(new Province("019", "Thái Nguyên"));
            listProvince.add(new Province("020", "Lạng Sơn"));
            listProvince.add(new Province("022", "Quảng Ninh"));
            listProvince.add(new Province("024", "Bắc Giang"));
            listProvince.add(new Province("025", "Phú Thọ"));
        }

//        final int lengthListProvince = listProvince.size() ;
//        for (Province province : listProvince) {
//            System.out.println(province.getId());
//        }

        int userSel , userConfirm ;
        String idNumber ;

        final String SpaceLine = "+----------+---------------------------------------------+----------+";
        System.out.println(SpaceLine);
        System.out.println("|NGAN HANG SO   |   " + AUTHOR + VERSION + "                                   |");
        System.out.println(SpaceLine);
        System.out.println("|   1. Nhap CCCD                                                    |");
        System.out.println("|   0. Thoat                                                        |");
        System.out.println(SpaceLine);

        do {
            System.out.print("Chuc nang : ");
            userSel = sc.nextInt() ;
        } while (userSel != 0 && userSel != 1) ;

        System.out.println(userSel);

        if (userSel == 0){
            System.out.println("Exited");
        } else {
            int tempRnd = randomNumber() ;

            //Yeu cau nguoi dung nhap ma xac nhan
            System.out.println("Nhap ma xac nhan : " + tempRnd);
            do {
                userConfirm = sc.nextInt();
            } while (tempRnd != userConfirm);


            try {
                System.out.print("Nhap so CCCD : ");
                 idNumber = sc.next();
            } catch (Exception e) {
                System.out.print("Nhap so CCCD : ");
                 idNumber = sc.next();
                System.out.println("Wrong input");
            }

            final String idProvince = idNumber.substring(0,3);
            final String genderNumber = idNumber.substring(3,4);
            final String birthYear = idNumber.substring(4,6);
            final String rndNumberID = idNumber.substring(6,12);
            System.out.println(idProvince + "   " + genderNumber + "   " + birthYear + "   " + rndNumberID );

            System.out.println(processIdProvince(listProvince,idProvince) + "   " + processGender(genderNumber) + "     "+ processAge(genderNumber,birthYear));

            String func = " |    1. Kiểm tra nơi sinh \n |    2. Kiểm tra năm sinh, giới tính \n |    3. Kiểm tra số ngẫu nhiên \n |    0. Thoát \n Chọn chức năng : " ;
            int selFunc = 5;
            do {
                try {
                    System.out.println(func);
                    selFunc = sc.nextInt();
                } catch (Exception e) {
                     selFunc = sc.nextInt();
                    System.out.println("Wrong input");
                }

                switch (selFunc) {
                    case 1 :
                        System.out.println("Nơi sinh :" + processIdProvince(listProvince,idProvince));
                        break;
                    case 2:
                        System.out.println("Giới tình : " + processGender(genderNumber) + "| Năm sinh : " + processAge(genderNumber,birthYear));
                        break;
                    case 3:
                        System.out.println("Số ngẫu nhiên : " + rndNumberID);
                        break;
                    default:
                        selFunc = 0;
                }
            } while (selFunc != 0) ;
        }
    }
}








