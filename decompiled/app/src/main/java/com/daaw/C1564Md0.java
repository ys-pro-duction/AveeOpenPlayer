package com.daaw;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Md0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1564Md0 implements InterfaceC6299lf0 {
    public static final Set a = new HashSet();

    @Override // com.daaw.InterfaceC6299lf0
    public void a(String str, Throwable th) {
        boolean z = U80.a;
    }

    @Override // com.daaw.InterfaceC6299lf0
    public void b(String str) {
        e(str, null);
    }

    @Override // com.daaw.InterfaceC6299lf0
    public void c(String str, Throwable th) {
        Set set = a;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }

    @Override // com.daaw.InterfaceC6299lf0
    public void d(String str) {
        c(str, null);
    }

    public void e(String str, Throwable th) {
        boolean z = U80.a;
    }
}
