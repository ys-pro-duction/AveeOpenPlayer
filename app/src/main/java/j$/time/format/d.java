package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {
    public final e[] a;
    public final boolean b;

    public d(ArrayList arrayList, boolean z) {
        this((e[]) arrayList.toArray(new e[arrayList.size()]), z);
    }

    public d(e[] eVarArr, boolean z) {
        this.a = eVarArr;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(j$.time.format.s r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 1
            boolean r2 = r7.b
            if (r2 == 0) goto Le
            int r3 = r8.c
            int r3 = r3 + r1
            r8.c = r3
        Le:
            j$.time.format.e[] r3 = r7.a     // Catch: java.lang.Throwable -> L27
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L12:
            if (r5 >= r4) goto L2c
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.k(r8, r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L29
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r9 = r8.c
            int r9 = r9 - r1
            r8.c = r9
            return r1
        L27:
            r9 = move-exception
            goto L30
        L29:
            int r5 = r5 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r0 = r8.c
            int r0 = r0 - r1
            r8.c = r0
        L37:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.d.k(j$.time.format.s, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.e
    public final int n(p pVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        e[] eVarArr = this.a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = pVar.d;
            w wVarC = pVar.c();
            wVarC.getClass();
            w wVar = new w();
            wVar.a.putAll(wVarC.a);
            wVar.b = wVarC.b;
            wVar.c = wVarC.c;
            wVar.d = wVarC.d;
            arrayList.add(wVar);
            int length = eVarArr.length;
            int iN = i;
            while (i2 < length) {
                iN = eVarArr[i2].n(pVar, charSequence, iN);
                if (iN < 0) {
                    arrayList.remove(arrayList.size() - 1);
                    return i;
                }
                i2++;
            }
            arrayList.remove(arrayList.size() - 2);
            return iN;
        }
        int length2 = eVarArr.length;
        while (i2 < length2) {
            i = eVarArr[i2].n(pVar, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        e[] eVarArr = this.a;
        if (eVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (e eVar : eVarArr) {
                sb.append(eVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
