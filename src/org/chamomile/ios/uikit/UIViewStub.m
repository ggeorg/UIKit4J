#import "UIViewStub.h"

#import "J2ObjC_source.h"
#import "org/chamomile/ios/core/graphics/CGRect.h"

@implementation UIView (JavaUIView)
    
+ (const J2ObjcClassInfo *)__metadata {
    static J2ObjcMethodInfo methods[] = {
        { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    };
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
    methods[0].selector = @selector(init);
#pragma clang diagnostic pop
    static const J2ObjcClassInfo _UIView = { "UIView", "org.chamomile.ios.uikit", NULL, methods, NULL, 7, 0x1, 1, 0, -1, -1, -1, -1, -1 };
    return &_UIView;
}

- (OrgChamomileIosCoreGraphicsCGRect *) java_getFrame {
    return OrgChamomileIosUikitUIView_java_getFrame(self);
}

- (void)java_setFrame:(OrgChamomileIosCoreGraphicsCGRect *)arg0 {
	OrgChamomileIosUikitUIView_java_setFrame_(self, arg0);
}

@end

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(UIView)

// Empty class to force category to be loaded.
@implementation JavaUIViewCategoryDummy
@end
