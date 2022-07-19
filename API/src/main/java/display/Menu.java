package display;

import model.constant.constant;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("----------Mời chon chuc nang :----------");
            System.out.println("1: Chon lua đuong link base URL");
            System.out.println("2: Chon lua API cần kiem thu tu dong");
            System.out.println("3: Chay tung unit test case hay tat ca unit test của mot API");
            System.out.println("0: Thoat.");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1) {
                System.out.println("Chon lua duong link base URL:");
                String url = sc.nextLine();
                if(!url.isEmpty() ) constant.BaseURL = url;
                else constant.BaseURL = "https://auctions-app-2.herokuapp.com/api";
                System.out.println("Base URL là: " + constant.BaseURL);

            }
            else if(choice == 2) {
                System.out.println("Chon lựa API can kiem thu tu dong");
                API api = new API();
                api.menuAPI();
            }
            else if(choice == 3) {
                System.out.println("Chạy từng unit test case hay tất cả unit test của một API");
                ChooseTest chTest = new ChooseTest();
                chTest.menuTest();
            }
            else  {
                System.out.println("Thoát chương trình");
            }
        } while(choice != 0);

    }
}

