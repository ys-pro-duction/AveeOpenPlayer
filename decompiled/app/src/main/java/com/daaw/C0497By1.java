package com.daaw;

/* JADX INFO: renamed from: com.daaw.By1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0497By1 extends AbstractCallableC3025Zy1 {
    public static volatile Long i;
    public static final Object j = new Object();

    public C0497By1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i2, int i3) {
        super(c2813Xx1, "1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", c9733xv1, i2, 22);
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        if (i == null) {
            synchronized (j) {
                try {
                    if (i == null) {
                        i = (Long) this.f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.e) {
            this.e.z0(i.longValue());
        }
    }
}
