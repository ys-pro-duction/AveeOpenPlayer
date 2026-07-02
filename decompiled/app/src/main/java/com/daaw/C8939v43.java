package com.daaw;

import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.v43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8939v43 extends IOException {
    public U43 B;
    public boolean C;

    public C8939v43(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.B = null;
    }

    public static C8653u43 a() {
        return new C8653u43("Protocol message tag had invalid wire type.");
    }

    public static C8939v43 b() {
        return new C8939v43("Protocol message end-group tag did not match expected tag.");
    }

    public static C8939v43 c() {
        return new C8939v43("Protocol message contained an invalid tag (zero).");
    }

    public static C8939v43 d() {
        return new C8939v43("Protocol message had invalid UTF-8.");
    }

    public static C8939v43 e() {
        return new C8939v43("CodedInputStream encountered a malformed varint.");
    }

    public static C8939v43 f() {
        return new C8939v43("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C8939v43 g() {
        return new C8939v43("Failed to parse the message.");
    }

    public static C8939v43 i() {
        return new C8939v43("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C8939v43 j() {
        return new C8939v43("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final C8939v43 h(U43 u43) {
        this.B = u43;
        return this;
    }

    public final void k() {
        this.C = true;
    }

    public final boolean l() {
        return this.C;
    }

    public C8939v43(String str) {
        super(str);
        this.B = null;
    }
}
