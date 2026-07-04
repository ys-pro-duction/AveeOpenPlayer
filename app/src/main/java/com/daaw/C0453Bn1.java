package com.daaw;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.Bn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0453Bn1 {
    public final InterfaceC0349An1 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public C0453Bn1(InterfaceC0349An1 interfaceC0349An1) {
        this.a = interfaceC0349An1;
    }

    public final InterfaceC1086Hn1 a(Object... objArr) {
        Constructor constructorZza;
        synchronized (this.b) {
            if (!this.b.get()) {
                try {
                    constructorZza = this.a.zza();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                    constructorZza = null;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (InterfaceC1086Hn1) constructorZza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
