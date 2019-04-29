package com.example.reorder;

public class MenuData {

    private static String menu_name;
    private static int menu_price;
    private static String menu_info;

        public static String getMenu_name() {
            return menu_name;
        }

        public void setMenu_name(String menu_name) {
            this.menu_name = menu_name;
    }

    public static int getMenu_price() {
        return menu_price;
    }

    public void setMenu_price(int menu_price) {
        this.menu_price = menu_price;
    }

    public static String getMenu_info() {
        return menu_info;
    }

    public void setMenu_info(String menu_info) {
        this.menu_info = menu_info;
    }
}
