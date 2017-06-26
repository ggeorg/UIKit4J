#import "UIWindowStub.h"

#import "J2ObjC_source.h"
#import "org/chamomile/ios/core/graphics/CGRect.h"

@implementation UIWindow (JavaUIWindow)
    
+ (const J2ObjcClassInfo *)__metadata {
    static J2ObjcMethodInfo methods[] = {
        { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    };
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
    methods[0].selector = @selector(init);
#pragma clang diagnostic pop
    static const J2ObjcClassInfo _UIWindow = { "UIWindow", "org.chamomile.ios.uikit", NULL, methods, NULL, 7, 0x1, 1, 0, -1, -1, -1, -1, -1 };
    return &_UIWindow;
}

#include "UIWindowStubImpl.h"

@end

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(UIWindow)

// Empty class to force category to be loaded.
@implementation JavaUIWindowCategoryDummy
@end
