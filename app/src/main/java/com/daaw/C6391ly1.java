package com.daaw;

import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.ly1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6391ly1 implements Iterable, InterfaceC1637Mv1 {
    public final String B;

    public C6391ly1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.B = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6391ly1) {
            return this.B.equals(((C6391ly1) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0918Fx1(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        ES2 es22;
        int iA;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                b = str.equals(str4) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    b = 14;
                    str4 = str2;
                }
                str4 = str2;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b = 12;
                    str4 = str2;
                }
                str4 = str2;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    b = 0;
                }
                str4 = str2;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    b = 1;
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 13;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 7;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b = 11;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 4;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 15;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b = 16;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 5;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 8;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 9;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 10;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 6;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    b = 3;
                }
                str4 = str2;
                str5 = "charAt";
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                break;
        }
        String strZzi = AdError.UNDEFINED_DOMAIN;
        switch (b) {
            case 0:
                AbstractC7831r73.j(str5, 1, list);
                int iA2 = !list.isEmpty() ? (int) AbstractC7831r73.a(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue()) : 0;
                String str6 = this.B;
                return (iA2 < 0 || iA2 >= str6.length()) ? InterfaceC1637Mv1.A : new C6391ly1(String.valueOf(str6.charAt(iA2)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.B);
                for (int i5 = 0; i5 < list.size(); i5++) {
                    sb.append(es2.b((InterfaceC1637Mv1) list.get(i5)).zzi());
                }
                return new C6391ly1(sb.toString());
            case 2:
                AbstractC7831r73.h(str4, 1, list);
                String str7 = this.B;
                InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(0));
                if ("length".equals(interfaceC1637Mv1B.zzi())) {
                    return InterfaceC1637Mv1.y;
                }
                double dDoubleValue = interfaceC1637Mv1B.zzh().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str7.length()) ? InterfaceC1637Mv1.z : InterfaceC1637Mv1.y;
            case 3:
                AbstractC7831r73.j("indexOf", 2, list);
                String str8 = this.B;
                if (list.size() > 0) {
                    strZzi = es2.b((InterfaceC1637Mv1) list.get(0)).zzi();
                }
                return new C1825Oq1(Double.valueOf(str8.indexOf(strZzi, (int) AbstractC7831r73.a(list.size() >= 2 ? es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue() : 0.0d))));
            case 4:
                AbstractC7831r73.j("lastIndexOf", 2, list);
                String str9 = this.B;
                if (list.size() > 0) {
                    strZzi = es2.b((InterfaceC1637Mv1) list.get(0)).zzi();
                }
                String str10 = strZzi;
                return new C1825Oq1(Double.valueOf(str9.lastIndexOf(str10, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : AbstractC7831r73.a(r3)))));
            case 5:
                AbstractC7831r73.j("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : es2.b((InterfaceC1637Mv1) list.get(0)).zzi()).matcher(this.B);
                return matcher.find() ? new C6350lp1(Arrays.asList(new C6391ly1(matcher.group()))) : InterfaceC1637Mv1.u;
            case 6:
                AbstractC7831r73.j("replace", 2, list);
                InterfaceC1637Mv1 interfaceC1637Mv1A = InterfaceC1637Mv1.t;
                if (!list.isEmpty()) {
                    strZzi = es2.b((InterfaceC1637Mv1) list.get(0)).zzi();
                    if (list.size() > 1) {
                        interfaceC1637Mv1A = es2.b((InterfaceC1637Mv1) list.get(1));
                    }
                }
                String str11 = strZzi;
                String str12 = this.B;
                int iIndexOf = str12.indexOf(str11);
                if (iIndexOf < 0) {
                    return this;
                }
                if (interfaceC1637Mv1A instanceof AbstractC9435wr1) {
                    i2 = 0;
                    interfaceC1637Mv1A = ((AbstractC9435wr1) interfaceC1637Mv1A).a(es2, Arrays.asList(new C6391ly1(str11), new C1825Oq1(Double.valueOf(iIndexOf)), this));
                } else {
                    i2 = 0;
                }
                return new C6391ly1(str12.substring(i2, iIndexOf) + interfaceC1637Mv1A.zzi() + str12.substring(iIndexOf + str11.length()));
            case 7:
                AbstractC7831r73.j("search", 1, list);
                if (!list.isEmpty()) {
                    strZzi = es2.b((InterfaceC1637Mv1) list.get(0)).zzi();
                }
                return Pattern.compile(strZzi).matcher(this.B).find() ? new C1825Oq1(Double.valueOf(r0.start())) : new C1825Oq1(Double.valueOf(-1.0d));
            case 8:
                AbstractC7831r73.j("slice", 2, list);
                String str13 = this.B;
                double dA = AbstractC7831r73.a(!list.isEmpty() ? es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue() : 0.0d);
                double dMax = dA < 0.0d ? Math.max(((double) str13.length()) + dA, 0.0d) : Math.min(dA, str13.length());
                double dA2 = AbstractC7831r73.a(list.size() > 1 ? es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue() : str13.length());
                double dMax2 = dA2 < 0.0d ? Math.max(((double) str13.length()) + dA2, 0.0d) : Math.min(dA2, str13.length());
                int i6 = (int) dMax;
                return new C6391ly1(str13.substring(i6, Math.max(0, ((int) dMax2) - i6) + i6));
            case 9:
                AbstractC7831r73.j("split", 2, list);
                String str14 = this.B;
                if (str14.length() == 0) {
                    return new C6350lp1(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzi2 = es2.b((InterfaceC1637Mv1) list.get(0)).zzi();
                    long jD = list.size() > 1 ? AbstractC7831r73.d(es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue()) : 2147483647L;
                    if (jD == 0) {
                        return new C6350lp1();
                    }
                    String[] strArrSplit = str14.split(Pattern.quote(strZzi2), ((int) jD) + 1);
                    int length = strArrSplit.length;
                    if (!strZzi2.isEmpty() || length <= 0) {
                        i3 = length;
                        i4 = 0;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i3 = length - 1;
                        i4 = zIsEmpty;
                        if (!strArrSplit[i3].isEmpty()) {
                            i3 = length;
                            i4 = zIsEmpty;
                        }
                    }
                    if (length > jD) {
                        i3--;
                    }
                    while (i4 < i3) {
                        arrayList.add(new C6391ly1(strArrSplit[i4]));
                        i4++;
                    }
                }
                return new C6350lp1(arrayList);
            case 10:
                AbstractC7831r73.j("substring", 2, list);
                String str15 = this.B;
                if (list.isEmpty()) {
                    es22 = es2;
                    iA = 0;
                } else {
                    es22 = es2;
                    iA = (int) AbstractC7831r73.a(es22.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue());
                }
                int iA3 = list.size() > 1 ? (int) AbstractC7831r73.a(es22.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue()) : str15.length();
                int iMin = Math.min(Math.max(iA, 0), str15.length());
                int iMin2 = Math.min(Math.max(iA3, 0), str15.length());
                return new C6391ly1(str15.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                AbstractC7831r73.h("toLocaleUpperCase", 0, list);
                return new C6391ly1(this.B.toUpperCase());
            case 12:
                AbstractC7831r73.h("toLocaleLowerCase", 0, list);
                return new C6391ly1(this.B.toLowerCase());
            case 13:
                AbstractC7831r73.h("toLowerCase", 0, list);
                return new C6391ly1(this.B.toLowerCase(Locale.ENGLISH));
            case 14:
                AbstractC7831r73.h("toString", 0, list);
                return this;
            case 15:
                AbstractC7831r73.h("toUpperCase", 0, list);
                return new C6391ly1(this.B.toUpperCase(Locale.ENGLISH));
            case 16:
                AbstractC7831r73.h("toUpperCase", 0, list);
                return new C6391ly1(this.B.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        return "\"" + this.B + "\"";
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        return new C6391ly1(this.B);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Boolean zzg() {
        return Boolean.valueOf(!this.B.isEmpty());
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Double zzh() {
        if (this.B.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.B);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final String zzi() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return new C2913Yw1(this);
    }
}
