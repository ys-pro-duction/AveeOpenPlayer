package com.revenuecat.purchases;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.daaw.G10;
import com.daaw.InterfaceC1764Ob0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/AppLifecycleHandler;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "lifecycleDelegate", "<init>", "(Lcom/revenuecat/purchases/LifecycleDelegate;)V", "Lcom/daaw/Ob0;", "owner", "Lcom/daaw/G91;", "onStart", "(Lcom/daaw/Ob0;)V", "onStop", "onCreate", "onResume", "onPause", "onDestroy", "Lcom/revenuecat/purchases/LifecycleDelegate;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AppLifecycleHandler implements DefaultLifecycleObserver {
    private final LifecycleDelegate lifecycleDelegate;

    public AppLifecycleHandler(LifecycleDelegate lifecycleDelegate) {
        G10.g(lifecycleDelegate, "lifecycleDelegate");
        this.lifecycleDelegate = lifecycleDelegate;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1764Ob0 owner) {
        G10.g(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC1764Ob0 owner) {
        G10.g(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(InterfaceC1764Ob0 owner) {
        G10.g(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC1764Ob0 owner) {
        G10.g(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1764Ob0 owner) {
        G10.g(owner, "owner");
        this.lifecycleDelegate.onAppForegrounded();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1764Ob0 owner) {
        G10.g(owner, "owner");
        this.lifecycleDelegate.onAppBackgrounded();
    }
}
