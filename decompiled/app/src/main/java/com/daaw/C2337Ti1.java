package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ti1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2337Ti1 implements InterfaceC2233Si1 {
    public final QJ0 a;
    public final WG b;

    /* JADX INFO: renamed from: com.daaw.Ti1$a */
    public class a extends WG {
        public a(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.daaw.WG
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(NZ0 nz0, C2127Ri1 c2127Ri1) {
            String str = c2127Ri1.a;
            if (str == null) {
                nz0.z0(1);
            } else {
                nz0.w(1, str);
            }
            String str2 = c2127Ri1.b;
            if (str2 == null) {
                nz0.z0(2);
            } else {
                nz0.w(2, str2);
            }
        }
    }

    public C2337Ti1(QJ0 qj0) {
        this.a = qj0;
        this.b = new a(qj0);
    }

    @Override // com.daaw.InterfaceC2233Si1
    public List a(String str) {
        TJ0 tj0D = TJ0.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    @Override // com.daaw.InterfaceC2233Si1
    public void b(C2127Ri1 c2127Ri1) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(c2127Ri1);
            this.a.r();
        } finally {
            this.a.g();
        }
    }
}
