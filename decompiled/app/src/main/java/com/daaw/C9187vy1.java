package com.daaw;

/* JADX INFO: renamed from: com.daaw.vy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9187vy1 extends AbstractCallableC3025Zy1 {
    public static volatile Long i;
    public static final Object j = new Object();

    public C9187vy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i2, int i3) {
        super(c2813Xx1, "ttuIHg/yfWDxJlotLoMLf9WBnVTbWFFKY03C8KHR8FAhIQHccw4LaDLJatYkpo23", "xLOAO7msIR4UFUyldUn5stL2wwbLdISu2CSlTLg4f6Q=", c9733xv1, i2, 44);
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
            this.e.p0(i.longValue());
        }
    }
}
