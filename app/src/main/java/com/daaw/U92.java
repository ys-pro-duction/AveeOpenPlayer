package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class U92 extends IOException {
    public InterfaceC7467pp2 B;

    public U92(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.B = null;
    }

    public static C7004o92 a() {
        return new C7004o92("Protocol message tag had invalid wire type.");
    }

    public static U92 b() {
        return new U92("Protocol message contained an invalid tag (zero).");
    }

    public static U92 c() {
        return new U92("Protocol message had invalid UTF-8.");
    }

    public static U92 d() {
        return new U92("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static U92 e() {
        return new U92("Failed to parse the message.");
    }

    public static U92 g() {
        return new U92("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final U92 f(InterfaceC7467pp2 interfaceC7467pp2) {
        this.B = interfaceC7467pp2;
        return this;
    }

    public U92(String str) {
        super(str);
        this.B = null;
    }
}
