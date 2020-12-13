package com.hillel;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String text = "Задача 2. выбрать из фрагмента текста все ip адреса \n" +
                "примеры ip адресов: 127.0.0.1, 10.128.17.14, 10.130.24.1";
        SearcherAddressIP searcherAddressIP = new SearcherAddressIP();
        List<AddressIP> addresses = searcherAddressIP.search(text);
        for (AddressIP addressIP : addresses) {
            System.out.println(addressIP);
        }
    }
}
