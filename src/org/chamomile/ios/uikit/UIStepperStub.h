#ifndef _OrgChamomileIosUikitUIStepperStub_H_
#define _OrgChamomileIosUikitUIStepperStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIStepper.h"

@interface UIStepper (JavaUIStepper) <OrgChamomileIosUikitUIStepper>
@end

__attribute__((always_inline)) inline void UIStepper_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIStepper)

J2OBJC_TYPE_LITERAL_HEADER(UIStepper)

// Empty class to force category to be loaded.
@interface JavaUIStepperCategoryDummy : UIStepper
@end

#endif // _OrgChamomileIosUikitUIStepperStub_H_