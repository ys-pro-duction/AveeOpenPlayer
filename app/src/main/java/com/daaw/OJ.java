package com.daaw;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class OJ extends AbstractC3589c0 {
    public final a D = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // com.daaw.AbstractC3589c0
    public Random g() {
        Object obj = this.D.get();
        G10.f(obj, "get(...)");
        return (Random) obj;
    }
}
