package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Gi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0962Gi1 implements InterfaceC0858Fi1 {
    public final QJ0 a;
    public final WG b;

    /* JADX INFO: renamed from: com.daaw.Gi1$a */
    public class a extends WG {
        public a(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.daaw.WG
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(NZ0 nz0, C0754Ei1 c0754Ei1) {
            String str = c0754Ei1.a;
            if (str == null) {
                nz0.z0(1);
            } else {
                nz0.w(1, str);
            }
            String str2 = c0754Ei1.b;
            if (str2 == null) {
                nz0.z0(2);
            } else {
                nz0.w(2, str2);
            }
        }
    }

    public C0962Gi1(QJ0 qj0) {
        this.a = qj0;
        this.b = new a(qj0);
    }

    @Override // com.daaw.InterfaceC0858Fi1
    public void a(C0754Ei1 c0754Ei1) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(c0754Ei1);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.InterfaceC0858Fi1
    public List b(String str) {
        TJ0 tj0D = TJ0.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
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
}
