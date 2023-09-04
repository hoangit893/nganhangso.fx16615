package vn.nganhangso;


import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Integer.parseInt;

public class Main {
    public static int randomNumberByMinMax(int min, int max){
        return (int) Math.floor(Math.random() *(max - min + 1) + min);
    }
    public static String randomString() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        int tempRnd ;
        String generatedString = "";

        for (int i = 0 ; i < 6; i++){
            tempRnd = randomNumberByMinMax(0,AlphaNumericString.length() - 1);
            generatedString += AlphaNumericString.substring(tempRnd,tempRnd + 1);
        }
        return generatedString;
    }

    public static boolean checkNumberByLength(String str, int length) {
        if (str.length() != length) return false;

        try {
            for (int i = 0; i < str.length();i++){
                Integer.parseInt(str.substring(i,i+1));
            }
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
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
        // Add listProvince
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
            listProvince.add(new Province("026","Vĩnh Phúc"));
            listProvince.add(new Province("027","Bắc Ninh"));
            listProvince.add(new Province("030","Hải Dương"));
            listProvince.add(new Province("031","Hải Phòng"));
            listProvince.add(new Province("033","Hưng Yên"));
            listProvince.add(new Province("034","Thái Bình"));
            listProvince.add(new Province("035","Hà Nam"));
            listProvince.add(new Province("036","Nam Định"));
            listProvince.add(new Province("037","Ninh Bình"));
            listProvince.add(new Province("038","Thanh Hóa"));
            listProvince.add(new Province("040","Nghệ An"));
            listProvince.add(new Province("042","Hà Tĩnh"));
            listProvince.add(new Province("044","Quảng Bình"));
            listProvince.add(new Province("045","Quảng Trị"));
            listProvince.add(new Province("046","Thừa Thiên Huế"));
            listProvince.add(new Province("048","Đà Nẵng"));
            listProvince.add(new Province("049","Quảng Nam"));
            listProvince.add(new Province("051","Quảng Ngãi"));
            listProvince.add(new Province("052","Bình Định"));
            listProvince.add(new Province("054","Phú Yên"));
            listProvince.add(new Province("056","Khánh Hòa"));
            listProvince.add(new Province("058","Ninh Thuận"));
            listProvince.add(new Province("060","Bình Thuận"));
            listProvince.add(new Province("062","Kon Tum"));
            listProvince.add(new Province("064","Gia Lai"));
            listProvince.add(new Province("066","Đắk Lắk"));
            listProvince.add(new Province("067","Đắk Nông"));
            listProvince.add(new Province("070","Bình Phước"));
            listProvince.add(new Province("068","Lâm Đồng"));
            listProvince.add(new Province("072","Tây Ninh"));
            listProvince.add(new Province("074","Bình Dương"));
            listProvince.add(new Province("75","Đồng Nai"));
            listProvince.add(new Province("077","Bà Rịa - Vũng Tàu"));
            listProvince.add(new Province("079","Hồ Chí Minh"));
            listProvince.add(new Province("080","Long An"));
            listProvince.add(new Province("082","Tiền Giang"));
            listProvince.add(new Province("083","Bến Tre"));
            listProvince.add(new Province("084","Trà Vinh"));
            listProvince.add(new Province("086","Vĩnh Long"));
            listProvince.add(new Province("087","Đồng Tháp"));
            listProvince.add(new Province("089","An Giang"));
            listProvince.add(new Province("091","Kiên Giang"));
            listProvince.add(new Province("092","Cần Thơ"));
            listProvince.add(new Province("093","Hậu Giang"));
            listProvince.add(new Province("094","Sóc Trăng"));
            listProvince.add(new Province("095","Bạc Liêu"));
            listProvince.add(new Province("096","Cà Mau"));
        }

        final String SpaceLine = "+----------+---------------------------------------------+----------+";

        System.out.println(SpaceLine);
        System.out.println("|CAPTCHA MODE                                                       |");
        System.out.println(SpaceLine);
        System.out.println("|   1. EASY                                                         |");
        System.out.println("|   0. HARD                                                         |");
        System.out.println(SpaceLine);
        System.out.print("Option : ");
        int captchaMode = sc.nextInt();
        int userSel ;



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

        if (userSel == 0){
            System.out.println("Exited");
        } else {
            String tempRnd;

            if (captchaMode == 1) {

                tempRnd = String.valueOf(randomNumberByMinMax(100, 999));
            } else {
                tempRnd = randomString();
            }

            //Yeu cau nguoi dung nhap ma xac nhan
            System.out.println("Nhap ma xac nhan : " + tempRnd);
            String userConfirm;

            System.out.println();
            do {
                userConfirm = sc.next();
            } while (!tempRnd.equals(userConfirm));

            String idNumber ;
            do {
                System.out.print("Nhap so CCCD : ");
                idNumber = sc.next();
            } while (!checkNumberByLength(idNumber,12));


            final String idProvince = idNumber.substring(0,3);
            final String genderNumber = idNumber.substring(3,4);
            final String birthYear = idNumber.substring(4,6);
            final String rndNumberID = idNumber.substring(6,12);

            String func = " |    1. Kiểm tra nơi sinh \n |    2. Kiểm tra năm sinh, giới tính \n |    3. Kiểm tra số ngẫu nhiên \n |    0. Thoát \n Chọn chức năng : " ;

            int selFunc;
            do {
                try {
                    System.out.print(func);
                    selFunc = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Wrong input");
                    selFunc = sc.nextInt();
                }

                switch (selFunc) {
                    case 0:
                        break;
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
                        System.out.print("Vui lòng nhập lại : ");
                        selFunc = sc.nextInt();
                }
            } while (selFunc != 0) ;
        }
    }
}








