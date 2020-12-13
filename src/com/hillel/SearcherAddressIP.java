package com.hillel;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearcherAddressIP {

    public final String regex = "(?:\\W|^)((?:\\d{1,3}\\.){3}\\d{1,3})(?:\\W|$)";

    public List<AddressIP> search(String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<AddressIP> addresses = new ArrayList<>();
        while (matcher.find()) {
            addresses.add(new AddressIP(matcher.group(1)));
        }
        return addresses;
    }
}
