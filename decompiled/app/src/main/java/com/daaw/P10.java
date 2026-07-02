package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class P10 extends IOException {
    public InterfaceC1900Pj0 B;
    public boolean C;

    public static class a extends P10 {
        public a(String str) {
            super(str);
        }
    }

    public P10(String str) {
        super(str);
        this.B = null;
    }

    public static P10 b() {
        return new P10("Protocol message end-group tag did not match expected tag.");
    }

    public static P10 c() {
        return new P10("Protocol message contained an invalid tag (zero).");
    }

    public static P10 d() {
        return new P10("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static P10 f() {
        return new P10("CodedInputStream encountered a malformed varint.");
    }

    public static P10 g() {
        return new P10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static P10 h() {
        return new P10("Failed to parse the message.");
    }

    public static P10 i() {
        return new P10("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static P10 l() {
        return new P10("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static P10 n() {
        return new P10("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.C;
    }

    public void j() {
        this.C = true;
    }

    public P10 k(InterfaceC1900Pj0 interfaceC1900Pj0) {
        this.B = interfaceC1900Pj0;
        return this;
    }

    public P10(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.B = null;
    }
}
