package com.daaw;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0776Eo {
    public static final InterfaceC0776Eo a = new InterfaceC0776Eo() { // from class: com.daaw.Do
        @Override // com.daaw.InterfaceC0776Eo
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
