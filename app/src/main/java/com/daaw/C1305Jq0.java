package com.daaw;

import android.os.Build;
import androidx.work.OverwritingInputMerger;
import com.daaw.AbstractC1585Mi1;

/* JADX INFO: renamed from: com.daaw.Jq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1305Jq0 extends AbstractC1585Mi1 {
    public C1305Jq0(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }

    public static C1305Jq0 d(Class cls) {
        return (C1305Jq0) new a(cls).b();
    }

    /* JADX INFO: renamed from: com.daaw.Jq0$a */
    public static final class a extends AbstractC1585Mi1.a {
        public a(Class cls) {
            super(cls);
            this.c.d = OverwritingInputMerger.class.getName();
        }

        @Override // com.daaw.AbstractC1585Mi1.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1305Jq0 c() {
            if (this.a && Build.VERSION.SDK_INT >= 23 && this.c.j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new C1305Jq0(this);
        }

        @Override // com.daaw.AbstractC1585Mi1.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
