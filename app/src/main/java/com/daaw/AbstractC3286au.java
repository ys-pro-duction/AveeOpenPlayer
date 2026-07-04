package com.daaw;

import com.google.ads.AdSize;

/* JADX INFO: renamed from: com.daaw.au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3286au {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(b(str.charAt(i)));
        }
        return sb.toString();
    }

    public static char b(char c) {
        if (c == '\'') {
            return '\'';
        }
        if (c == ';') {
            return 'l';
        }
        if (c == '=') {
            return 'i';
        }
        if (c == '[') {
            return '-';
        }
        if (c == ']') {
            return '.';
        }
        if (c == '}') {
            return '4';
        }
        switch (c) {
            case ',':
                return 'z';
            case '-':
                return 'j';
            case '.':
                return '}';
            default:
                switch (c) {
                    case '0':
                        return '9';
                    case '1':
                        return '{';
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        return 'r';
                    case '3':
                        return 'p';
                    case '4':
                        return 'w';
                    case '5':
                        return 'n';
                    case '6':
                        return 'a';
                    case '7':
                        return 'h';
                    case '8':
                        return 'd';
                    case '9':
                        return '=';
                    default:
                        switch (c) {
                            case 'a':
                                return 'f';
                            case 'b':
                                return '8';
                            case 'c':
                                return 'q';
                            case 'd':
                                return '6';
                            case 'e':
                                return '5';
                            case 'f':
                                return ',';
                            case 'g':
                                return '2';
                            case 'h':
                                return 'g';
                            case 'i':
                                return 'y';
                            case 'j':
                                return 'e';
                            case 'k':
                                return 'x';
                            case 'l':
                                return 'o';
                            case 'm':
                                return '3';
                            case 'n':
                                return 'c';
                            case 'o':
                                return 'm';
                            case 'p':
                                return ']';
                            case 'q':
                                return '[';
                            case 'r':
                                return 'b';
                            case 's':
                                return 'k';
                            case 't':
                                return ';';
                            case 'u':
                                return '1';
                            case 'v':
                                return '0';
                            case 'w':
                                return 'u';
                            case 'x':
                                return 's';
                            case 'y':
                                return '7';
                            case 'z':
                                return 'v';
                            case '{':
                                return 't';
                            default:
                                return c;
                        }
                }
        }
    }
}
