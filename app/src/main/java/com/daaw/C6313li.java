package com.daaw;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6313li implements InterfaceC9547xG {
    public static final String c;
    public static final String d;
    public static final String e;
    public static final Set f;
    public static final C6313li g;
    public static final C6313li h;
    public final String a;
    public final String b;

    static {
        String strA = AbstractC4861gY0.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = strA;
        String strA2 = AbstractC4861gY0.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        d = strA2;
        String strA3 = AbstractC4861gY0.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = strA3;
        f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(EG.b("proto"), EG.b("json"))));
        g = new C6313li(strA, null);
        h = new C6313li(strA2, strA3);
    }

    public C6313li(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static C6313li c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C6313li(str2, str3);
    }

    @Override // com.daaw.InterfaceC9547xG
    public Set a() {
        return f;
    }

    public byte[] b() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        String str2 = this.a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    @Override // com.daaw.EB
    public byte[] getExtras() {
        return b();
    }

    @Override // com.daaw.EB
    public String getName() {
        return "cct";
    }
}
