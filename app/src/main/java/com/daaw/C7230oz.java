package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7230oz implements InterfaceC6951nz {
    public final QJ0 a;
    public final WG b;

    /* JADX INFO: renamed from: com.daaw.oz$a */
    public class a extends WG {
        public a(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // com.daaw.WG
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(NZ0 nz0, C5826jz c5826jz) {
            String str = c5826jz.a;
            if (str == null) {
                nz0.z0(1);
            } else {
                nz0.w(1, str);
            }
            String str2 = c5826jz.b;
            if (str2 == null) {
                nz0.z0(2);
            } else {
                nz0.w(2, str2);
            }
        }
    }

    public C7230oz(QJ0 qj0) {
        this.a = qj0;
        this.b = new a(qj0);
    }

    @Override // com.daaw.InterfaceC6951nz
    public List a(String str) {
        TJ0 tj0D = TJ0.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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

    @Override // com.daaw.InterfaceC6951nz
    public boolean b(String str) {
        TJ0 tj0D = TJ0.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z = cursorB.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC6951nz
    public boolean c(String str) {
        TJ0 tj0D = TJ0.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z = cursorB.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC6951nz
    public void d(C5826jz c5826jz) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(c5826jz);
            this.a.r();
        } finally {
            this.a.g();
        }
    }
}
