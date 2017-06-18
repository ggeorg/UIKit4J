#import "UIButtonStub.h"

#import "J2ObjC_source.h"

@implementation UIButton (JavaUIButton)
    
+ (const J2ObjcClassInfo *)__metadata {
    static J2ObjcMethodInfo methods[] = {
        { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    };
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
    methods[0].selector = @selector(init);
#pragma clang diagnostic pop
    static const J2ObjcClassInfo _UIButtonStub = { "UIButton", "org.chamomile.ios.uikit", NULL, methods, NULL, 7, 0x1, 1, 0, -1, -1, -1, -1, -1 };
    return &_UIButtonStub;
}

@end


J2OBJC_CLASS_TYPE_LITERAL_SOURCE(UIButton)

// Empty class to force category to be loaded.
@implementation JavaUIButtonCategoryDummy
@end
