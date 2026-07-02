package com.daaw;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.ry1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8064ry1 extends AbstractCallableC3025Zy1 {
    public static final C3308az1 j = new C3308az1();
    public final Context i;

    public C8064ry1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, Context context) {
        super(c2813Xx1, "gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", c9733xv1, i, 29);
        this.i = context;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        this.e.o0("E");
        AtomicReference atomicReferenceA = j.a(this.i.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                try {
                    if (atomicReferenceA.get() == null) {
                        atomicReferenceA.set((String) this.f.invoke(null, this.i));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceA.get();
        synchronized (this.e) {
            this.e.o0(AbstractC7499pw1.a(str.getBytes(), true));
        }
    }
}
