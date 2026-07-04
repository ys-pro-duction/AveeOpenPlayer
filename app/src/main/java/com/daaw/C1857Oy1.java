package com.daaw;

/* JADX INFO: renamed from: com.daaw.Oy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1857Oy1 extends AbstractCallableC3025Zy1 {
    public static volatile Long i;
    public static final Object j = new Object();

    public C1857Oy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i2, int i3) {
        super(c2813Xx1, "pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", c9733xv1, i2, 33);
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
            this.e.M(i.longValue());
        }
    }
}
