package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.r01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7794r01 implements InterfaceC7516q01 {
    public final QJ0 a;
    public final WG b;
    public final PR0 c;

    /* JADX INFO: renamed from: com.daaw.r01$a */
    public class a extends WG {
        public a(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // com.daaw.WG
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(NZ0 nz0, C7237p01 c7237p01) {
            String str = c7237p01.a;
            if (str == null) {
                nz0.z0(1);
            } else {
                nz0.w(1, str);
            }
            nz0.S(2, c7237p01.b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.r01$b */
    public class b extends PR0 {
        public b(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C7794r01(QJ0 qj0) {
        this.a = qj0;
        this.b = new a(qj0);
        this.c = new b(qj0);
    }

    @Override // com.daaw.InterfaceC7516q01
    public List a() {
        TJ0 tj0D = TJ0.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC7516q01
    public void b(C7237p01 c7237p01) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(c7237p01);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.InterfaceC7516q01
    public C7237p01 c(String str) {
        TJ0 tj0D = TJ0.d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            return cursorB.moveToFirst() ? new C7237p01(cursorB.getString(AbstractC2069Qu.b(cursorB, "work_spec_id")), cursorB.getInt(AbstractC2069Qu.b(cursorB, "system_id"))) : null;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC7516q01
    public void d(String str) {
        this.a.b();
        NZ0 nz0A = this.c.a();
        if (str == null) {
            nz0A.z0(1);
        } else {
            nz0A.w(1, str);
        }
        this.a.c();
        try {
            nz0A.z();
            this.a.r();
        } finally {
            this.a.g();
            this.c.f(nz0A);
        }
    }
}
