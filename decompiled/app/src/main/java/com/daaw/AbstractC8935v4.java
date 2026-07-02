package com.daaw;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8935v4 {
    public static final void a(C8370t4 c8370t4, SparseArray sparseArray) {
        G10.g(c8370t4, "<this>");
        G10.g(sparseArray, DiagnosticsEntry.Histogram.VALUES_KEY);
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueA = AbstractC8649u4.a(sparseArray.get(iKeyAt));
            C1252Jd c1252Jd = C1252Jd.a;
            G10.f(autofillValueA, "value");
            if (c1252Jd.d(autofillValueA)) {
                c8370t4.b().b(iKeyAt, c1252Jd.i(autofillValueA).toString());
            } else {
                if (c1252Jd.b(autofillValueA)) {
                    throw new C0673Do0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (c1252Jd.c(autofillValueA)) {
                    throw new C0673Do0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (c1252Jd.e(autofillValueA)) {
                    throw new C0673Do0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(C8370t4 c8370t4, ViewStructure viewStructure) {
        G10.g(c8370t4, "<this>");
        G10.g(viewStructure, "root");
        int iA = C10200zd.a.a(viewStructure, c8370t4.b().a().size());
        for (Map.Entry entry : c8370t4.b().a().entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            AbstractC6314li0.a(entry.getValue());
            C10200zd c10200zd = C10200zd.a;
            ViewStructure viewStructureB = c10200zd.b(viewStructure, iA);
            if (viewStructureB != null) {
                C1252Jd c1252Jd = C1252Jd.a;
                AutofillId autofillIdA = c1252Jd.a(viewStructure);
                G10.d(autofillIdA);
                c1252Jd.g(viewStructureB, autofillIdA, iIntValue);
                c10200zd.d(viewStructureB, iIntValue, c8370t4.c().getContext().getPackageName(), null, null);
                c1252Jd.h(viewStructureB, 1);
                throw null;
            }
            iA++;
        }
    }
}
