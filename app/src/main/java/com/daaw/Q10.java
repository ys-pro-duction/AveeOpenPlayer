package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class Q10 extends IOException {
    public InterfaceC2026Qj0 B;

    public Q10(String str) {
        super(str);
        this.B = null;
    }

    public static Q10 b() {
        return new Q10("Protocol message end-group tag did not match expected tag.");
    }

    public static Q10 c() {
        return new Q10("Protocol message contained an invalid tag (zero).");
    }

    public static Q10 d() {
        return new Q10("Protocol message had invalid UTF-8.");
    }

    public static Q10 e() {
        return new Q10("Protocol message tag had invalid wire type.");
    }

    public static Q10 f() {
        return new Q10("CodedInputStream encountered a malformed varint.");
    }

    public static Q10 g() {
        return new Q10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static Q10 h() {
        return new Q10("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static Q10 j() {
        return new Q10("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static Q10 k() {
        return new Q10("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public InterfaceC2026Qj0 a() {
        return this.B;
    }

    public Q10 i(InterfaceC2026Qj0 interfaceC2026Qj0) {
        this.B = interfaceC2026Qj0;
        return this;
    }
}
