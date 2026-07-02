package com.daaw;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.daaw.Hc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1041Hc0 {
    public static AbstractC1041Hc0 b(InterfaceC1764Ob0 interfaceC1764Ob0) {
        return new C1145Ic0(interfaceC1764Ob0, ((InterfaceC0417Be1) interfaceC1764Ob0).n());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
