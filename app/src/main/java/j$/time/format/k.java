package j$.time.format;

import java.text.ParsePosition;

/* JADX INFO: loaded from: classes2.dex */
public class k {
    public String a;
    public String b;
    public final char c;
    public k d;
    public k e;

    public boolean b(char c, char c2) {
        return c == c2;
    }

    public k(String str, String str2, k kVar) {
        this.a = str;
        this.b = str2;
        this.d = kVar;
        if (str.isEmpty()) {
            this.c = (char) 65535;
        } else {
            this.c = this.a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.a.length() + index;
        k kVar = this.d;
        if (kVar != null && length2 != length) {
            while (true) {
                if (b(kVar.c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strC = kVar.c(charSequence, parsePosition);
                    if (strC != null) {
                        return strC;
                    }
                } else {
                    kVar = kVar.e;
                    if (kVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.b;
    }

    public k d(String str, String str2, k kVar) {
        return new k(str, str2, kVar);
    }

    public boolean e(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.a, i);
        }
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }

    public final boolean a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && b(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i == this.a.length()) {
            if (i < str.length()) {
                String strSubstring = str.substring(i);
                for (k kVar = this.d; kVar != null; kVar = kVar.e) {
                    if (b(kVar.c, strSubstring.charAt(0))) {
                        return kVar.a(strSubstring, str2);
                    }
                }
                k kVarD = d(strSubstring, str2, null);
                kVarD.e = this.d;
                this.d = kVarD;
                return true;
            }
            this.b = str2;
            return true;
        }
        k kVarD2 = d(this.a.substring(i), this.b, this.d);
        this.a = str.substring(0, i);
        this.d = kVarD2;
        if (i < str.length()) {
            this.d.e = d(str.substring(i), str2, null);
            this.b = null;
            return true;
        }
        this.b = str2;
        return true;
    }
}
