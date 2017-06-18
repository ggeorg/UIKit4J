//
//  ViewController.m
//  UIKit4J
//
//  Created by George Georgopoulos on 18/06/2017.
//  Copyright © 2017 Chamomile. All rights reserved.
//

#import "ViewController.h"

#import "Showcase.h"

#import "UIButton.h"
#import "UIView.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    
    //[UIButton buttonWithType:UIButtonTypeRoundedRect];
    
    self.view.frame = CGRectMake(0, 0, 256, 256);
    
    UIButton *btn = (UIButton *)[OrgChamomileIosShowcase createButtonWithInt:UIButtonTypeRoundedRect];
    [btn setFrame:CGRectMake(52, 252, 215, 40)];
    
    [OrgChamomileIosShowcase addSubviewWithOrgChamomileIosUikitUIView:(id<OrgChamomileIosUikitUIView>)self.view
                                     withOrgChamomileIosUikitUIButton:(id<OrgChamomileIosUikitUIButton>)btn];
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


@end
