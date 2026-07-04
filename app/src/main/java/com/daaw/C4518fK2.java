package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.fK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4518fK2 implements InterfaceC3682cK2 {
    public final int[] a = new int[2];

    @Override // com.daaw.InterfaceC3682cK2
    public final void a(View view, JSONObject jSONObject, InterfaceC3404bK2 interfaceC3404bK2, boolean z, boolean z2) {
        int i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    interfaceC3404bK2.a(viewGroup.getChildAt(i2), this, jSONObject, z2);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i4));
                int size2 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    i = i4 + 1;
                    if (i5 < size2) {
                        interfaceC3404bK2.a((View) arrayList3.get(i5), this, jSONObject, z2);
                        i5++;
                    }
                }
                i4 = i;
            }
        }
    }

    @Override // com.daaw.InterfaceC3682cK2
    public final JSONObject zza(View view) {
        if (view == null) {
            return AbstractC6491mK2.a(0, 0, 0, 0);
        }
        int[] iArr = this.a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.a;
        return AbstractC6491mK2.a(iArr2[0], iArr2[1], width, height);
    }
}
