package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class Ef3 extends IOException {
    public Ef3(String str) {
        super(str);
    }

    public static Cf3 a() {
        return new Cf3("Protocol message tag had invalid wire type.");
    }

    public static Ef3 b() {
        return new Ef3("Protocol message contained an invalid tag (zero).");
    }

    public static Ef3 c() {
        return new Ef3("Protocol message had invalid UTF-8.");
    }

    public static Ef3 d() {
        return new Ef3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static Ef3 e() {
        return new Ef3("Failed to parse the message.");
    }

    public static Ef3 f() {
        return new Ef3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
