package com.daaw;

import java.util.HashSet;

/* JADX INFO: renamed from: com.daaw.dJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3954dJ {
    public static final O80 a(InterfaceC9236w81 interfaceC9236w81, O80 o80) {
        G10.g(interfaceC9236w81, "<this>");
        G10.g(o80, "inlineClassType");
        return b(interfaceC9236w81, o80, new HashSet());
    }

    public static final O80 b(InterfaceC9236w81 interfaceC9236w81, O80 o80, HashSet hashSet) {
        O80 o80B;
        D71 d71A0 = interfaceC9236w81.a0(o80);
        if (!hashSet.add(d71A0)) {
            return null;
        }
        InterfaceC3631c81 interfaceC3631c81L = interfaceC9236w81.l(d71A0);
        if (interfaceC3631c81L != null) {
            O80 o80O = interfaceC9236w81.O(interfaceC3631c81L);
            O80 o80B2 = b(interfaceC9236w81, o80O, hashSet);
            if (o80B2 != null) {
                return ((o80B2 instanceof InterfaceC3159aT0) && interfaceC9236w81.C((InterfaceC3159aT0) o80B2) && interfaceC9236w81.q(o80) && (interfaceC9236w81.i0(interfaceC9236w81.a0(o80O)) || ((o80O instanceof InterfaceC3159aT0) && interfaceC9236w81.C((InterfaceC3159aT0) o80O)))) ? interfaceC9236w81.E(o80O) : (interfaceC9236w81.q(o80B2) || !interfaceC9236w81.f0(o80)) ? o80B2 : interfaceC9236w81.E(o80B2);
            }
            return null;
        }
        if (interfaceC9236w81.i0(d71A0)) {
            O80 o80U = interfaceC9236w81.U(o80);
            if (o80U == null || (o80B = b(interfaceC9236w81, o80U, hashSet)) == null) {
                return null;
            }
            if (!interfaceC9236w81.q(o80)) {
                return o80B;
            }
            if (!interfaceC9236w81.q(o80B) && (!(o80B instanceof InterfaceC3159aT0) || !interfaceC9236w81.C((InterfaceC3159aT0) o80B))) {
                return interfaceC9236w81.E(o80B);
            }
        }
        return o80;
    }
}
