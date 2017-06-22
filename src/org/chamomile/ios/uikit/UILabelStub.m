#import "UILabelStub.h"

#import "J2ObjC_source.h"

@implementation UILabel (JavaUILabel)
    
+ (const J2ObjcClassInfo *)__metadata {
    static J2ObjcMethodInfo methods[] = {
        { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    };
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
    methods[0].selector = @selector(init);
#pragma clang diagnostic pop
    static const J2ObjcClassInfo _UILabelStub = { "UILabel", "org.chamomile.ios.uikit", NULL, methods, NULL, 7, 0x1, 1, 0, -1, -1, -1, -1, -1 };
    return &_UILabelStub;
}

@end


J2OBJC_CLASS_TYPE_LITERAL_SOURCE(UILabel)

// Empty class to force category to be loaded.
@implementation JavaUILabelCategoryDummy
@end