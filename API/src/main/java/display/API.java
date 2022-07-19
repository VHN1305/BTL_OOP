package display;

import model.constant.constant;

import java.util.Scanner;

public class API {
    public void menuAPI() {
        Scanner sc= new Scanner(System.in) ;
        int luachonAPI = 0 ;
        System.out.println("----------Mời chọn API :----------");
        System.out.println("1: Upload Status ");
        System.out.println("2: Upload File ");
        System.out.println("3: Login");
        System.out.println("4: Sign Up");
        System.out.println("5: Edit Account");
        System.out.println("6: Logout");
        System.out.println("7. Change Password");
        System.out.println("8. Info");
        System.out.println("9: Get List Auctions ");
        System.out.println("10: Get Detail Auction");
        System.out.println("11: Create Auction ");
        System.out.println("12: Edit Auction ");
        System.out.println("13: Delete Auction ");
        System.out.println("14: Info Auction ");
        System.out.println("15: Create Item ");
        System.out.println("16: Edit Item ");
        System.out.println("17: Info Item ");
        System.out.println("18: Create Comment");
        System.out.println("19: Delete Comment");
        System.out.println("20: Get List Comment");
        System.out.println("21: Create Bid");
        System.out.println("22: Get List Bids");
        System.out.println("23: Get List Categoires");
        System.out.println("24: Get List Brands");
        System.out.println("25: Accept Max Bid");
        System.out.println("26: Contact Us");
        System.out.println("27: Like Auction");
        System.out.println("28: Get List Likes");
        System.out.println("29: Total Likes Of Auction");
        System.out.println("30: Get News");
        System.out.println("31: Read New");
        System.out.println("32: Get Notifications");
        System.out.println("33: Read Notifications");
        System.out.println("34: Get Slider");
        System.out.println("35: Search");
        System.out.println("36: Delete Notification");
        System.out.println("37: Get List Chat");
        System.out.println("38: Create Chat");
        System.out.println("39: Creat Message Of Chat");
        System.out.println("40: Get List Message Of Chat");
        System.out.println("41: Delivery");
        System.out.println("42: Rate");
        System.out.println("43: Get List Rate");
        System.out.println("44: Edit Rate");

        System.out.println("0: Thoát.");
        luachonAPI= sc.nextInt();
        constant.luachonAPI =luachonAPI;
        sc.nextLine();
        if(luachonAPI==1) {
            System.out.println("1: Upload Status");
        }
        else if(luachonAPI==2) {
            System.out.println("2: Upload File ");
        }
        else if(luachonAPI==3) {
            System.out.println("3: Login");
        }
        else if(luachonAPI==4) {
            System.out.println("4: Sign Up");
        }
        else if(luachonAPI==5) {
            System.out.println("5: Edit Account");
        }
        else if(luachonAPI==6) {
            System.out.println("6: Logout");
        }
        else if(luachonAPI==7) {
            System.out.println("7: Change Password");
        }
        else if(luachonAPI==8) {
            System.out.println("8: Info");
        }
        else if(luachonAPI==9) {
            System.out.println("9: Get List Auctions");
        }
        else if(luachonAPI==10) {
            System.out.println("10: Get Detail Auction");
        }
        else if(luachonAPI==11) {
            System.out.println("11: Create Auction ");
        }
        else if(luachonAPI==12) {
            System.out.println("12: Edit Auction ");
        }
        else if(luachonAPI==13) {
            System.out.println("13: Delete Auction ");
        }
        else if(luachonAPI==14) {
            System.out.println("14: Info Auction ");
        }
        else if(luachonAPI==15) {
            System.out.println("15: Create Item ");
        }
        else if(luachonAPI==16) {
            System.out.println("16: Edit Item ");
        }
        else if(luachonAPI==17) {
            System.out.println("17: Info Item ");
        }
        else if(luachonAPI==18) {
            System.out.println("18: Create Comment");
        }
        else if(luachonAPI==19) {
            System.out.println("19: Delete Comment");
        }
        else if(luachonAPI==20) {
            System.out.println("20: Get List Comment");
        }
        else if(luachonAPI==21) {
            System.out.println("21: Create Bid");
        }
        else if(luachonAPI==22) {
            System.out.println("22: Get List Bids");
        }
        else if(luachonAPI==23) {
            System.out.println("23: Get List Categoires");
        }
        else if(luachonAPI==24) {
            System.out.println("24: Get List Brands");
        }
        else if(luachonAPI==25) {
            System.out.println("25: Accept Max Bid");
        }
        else if(luachonAPI==26) {
            System.out.println("26: Contact Us");
        }
        else if(luachonAPI==27) {
            System.out.println("27: Like Auction");
        }
        else if(luachonAPI==28) {
            System.out.println("28: Get List Likes");
        }
        else if(luachonAPI==29) {
            System.out.println("29: Total Likes Of Auction");
        }
        else if(luachonAPI==30) {
            System.out.println("30: Get News");
        }
        else if(luachonAPI==30) {
            System.out.println("31: Read New");
        }
        else if(luachonAPI==30) {
            System.out.println("32: Get Notifications");
        }
        else if(luachonAPI==30) {
            System.out.println("33: Read Notifications");
        }
        else if(luachonAPI==30) {
            System.out.println("34: Get Slider");
        }
        else if(luachonAPI==30) {
            System.out.println("35: Search");
        }
        else if(luachonAPI==30) {
            System.out.println("36: Delete Notification");
        }
        else if(luachonAPI==30) {
            System.out.println("37: Get List Chat");
        }
        else if(luachonAPI==30) {
            System.out.println("38: Create Chat");
        }
        else if(luachonAPI==30) {
            System.out.println("39: Creat Message Of Chat");
        }
        else if(luachonAPI==30) {
            System.out.println("40: Get List Message Of Chat");
        }
        else if(luachonAPI==30) {
            System.out.println("41: Delivery");
        }
        else if(luachonAPI==30) {
            System.out.println("42: Rate");
        }
        else if(luachonAPI==30) {
            System.out.println("43: Get List Rate");
        }
        else if(luachonAPI==30) {
            System.out.println("44: Edit Rate");
        }
        else {
            System.out.println("Lựa chọn lỗi");
        }

    }
}

