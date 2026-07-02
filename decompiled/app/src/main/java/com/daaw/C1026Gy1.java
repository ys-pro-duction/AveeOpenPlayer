package com.daaw;

/* JADX INFO: renamed from: com.daaw.Gy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1026Gy1 extends AbstractCallableC3025Zy1 {
    public static volatile String i;
    public static final Object j = new Object();

    public C1026Gy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i2, int i3) {
        super(c2813Xx1, "hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", c9733xv1, i2, 1);
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        this.e.o("E");
        if (i == null) {
            synchronized (j) {
                try {
                    if (i == null) {
                        i = (String) this.f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.e) {
            this.e.o(i);
        }
    }
}
