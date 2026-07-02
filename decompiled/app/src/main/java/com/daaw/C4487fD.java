package com.daaw;

import com.daaw.C4208eD;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.fD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4487fD {
    public final TreeMap a = new TreeMap();

    public void a(C4208eD c4208eD) {
        TC key = c4208eD.b().getKey();
        C4208eD c4208eD2 = (C4208eD) this.a.get(key);
        if (c4208eD2 == null) {
            this.a.put(key, c4208eD);
            return;
        }
        C4208eD.a aVarC = c4208eD2.c();
        C4208eD.a aVarC2 = c4208eD.c();
        C4208eD.a aVar = C4208eD.a.ADDED;
        if (aVarC2 != aVar && aVarC == C4208eD.a.METADATA) {
            this.a.put(key, c4208eD);
            return;
        }
        if (aVarC2 == C4208eD.a.METADATA && aVarC != C4208eD.a.REMOVED) {
            this.a.put(key, C4208eD.a(aVarC, c4208eD.b()));
            return;
        }
        C4208eD.a aVar2 = C4208eD.a.MODIFIED;
        if (aVarC2 == aVar2 && aVarC == aVar2) {
            this.a.put(key, C4208eD.a(aVar2, c4208eD.b()));
            return;
        }
        if (aVarC2 == aVar2 && aVarC == aVar) {
            this.a.put(key, C4208eD.a(aVar, c4208eD.b()));
            return;
        }
        C4208eD.a aVar3 = C4208eD.a.REMOVED;
        if (aVarC2 == aVar3 && aVarC == aVar) {
            this.a.remove(key);
            return;
        }
        if (aVarC2 == aVar3 && aVarC == aVar2) {
            this.a.put(key, C4208eD.a(aVar3, c4208eD2.b()));
        } else {
            if (aVarC2 != aVar || aVarC != aVar3) {
                throw AbstractC6557mb.a("Unsupported combination of changes %s after %s", aVarC2, aVarC);
            }
            this.a.put(key, C4208eD.a(aVar2, c4208eD.b()));
        }
    }

    public List b() {
        return new ArrayList(this.a.values());
    }
}
