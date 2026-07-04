package com.daaw;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.eK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4239eK2 implements InterfaceC3682cK2 {
    public final InterfaceC3682cK2 a;

    public C4239eK2(InterfaceC3682cK2 interfaceC3682cK2) {
        this.a = interfaceC3682cK2;
    }

    @Override // com.daaw.InterfaceC3682cK2
    public final void a(View view, JSONObject jSONObject, InterfaceC3404bK2 interfaceC3404bK2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        PJ2 pj2A = PJ2.a();
        if (pj2A != null) {
            Collection collectionB = pj2A.b();
            int size = collectionB.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                View viewF = ((CJ2) it.next()).f();
                if (viewF != null && viewF.isAttachedToWindow() && viewF.isShown()) {
                    View view2 = viewF;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewF.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float fA = AbstractC8164sK2.a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (AbstractC8164sK2.a((View) arrayList.get(i)) <= fA) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            interfaceC3404bK2.a((View) arrayList.get(i2), this.a, jSONObject, z2);
        }
    }

    @Override // com.daaw.InterfaceC3682cK2
    public final JSONObject zza(View view) {
        JSONObject jSONObjectA = AbstractC6491mK2.a(0, 0, 0, 0);
        int iB = AbstractC7328pK2.b();
        int i = iB - 1;
        if (iB == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i == 0);
            return jSONObjectA;
        } catch (JSONException e) {
            AbstractC6770nK2.a("Error with setting output device status", e);
            return jSONObjectA;
        }
    }
}
