package com.scarlatti;

import java.util.Arrays;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Wednesday, 5/2/2018
 */
public class GeneralUtility {
    public static void main(String[] args) {
        System.out.println("Hello World invoked with args:" + Arrays.asList(args));
        String str = new String(System.console().readPassword());
        System.out.println(str);
    }
}
