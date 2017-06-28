#import "UISplitViewControllerStub.h"

#import "J2ObjC_source.h"

@implementation UISplitViewController (JavaUISplitViewController)
    
+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  methods[0].selector = @selector(init);
  #pragma clang diagnostic pop
  static const J2ObjcClassInfo _UISplitViewController = { "UISplitViewControllerStub", "org.chamomile.ios.uikit", NULL, methods, NULL, 7, 0x1, 1, 0, -1, -1, -1, -1, -1 };
  return &_UISplitViewController;
}

#include "UISplitViewControllerStubImpl.h"

@end

void UISplitViewController_init(UISplitViewController *self) {
  static IMP initImp;
  static dispatch_once_t token;
  dispatch_once(&token, ^{
    initImp = [UISplitViewController instanceMethodForSelector:@selector(init)];
  });
  ((id (*)(id, SEL))initImp)(self, @selector(init));
}

UISplitViewController *new_UISplitViewController_init() {
  J2OBJC_NEW_IMPL(UISplitViewController, init)
}

UISplitViewController *create_UISplitViewController_init() {
  J2OBJC_CREATE_IMPL(UISplitViewController, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(UISplitViewController)

// Empty class to force category to be loaded.
@implementation JavaUISplitViewControllerCategoryDummy
@end
